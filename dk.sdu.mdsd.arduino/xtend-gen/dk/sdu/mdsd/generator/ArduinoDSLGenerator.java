package dk.sdu.mdsd.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import dk.sdu.mdsd.arduinoDSL.Assignment;
import dk.sdu.mdsd.arduinoDSL.Attribute;
import dk.sdu.mdsd.arduinoDSL.Component;
import dk.sdu.mdsd.arduinoDSL.Expression;
import dk.sdu.mdsd.arduinoDSL.Node;
import dk.sdu.mdsd.arduinoDSL.NumberLiteral;
import dk.sdu.mdsd.arduinoDSL.Rate;
import dk.sdu.mdsd.arduinoDSL.Rule;
import dk.sdu.mdsd.arduinoDSL.State;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ArduinoDSLGenerator extends AbstractGenerator {
  private final HashMap<String, String> nodeRadioIDs = new HashMap<String, String>();
  
  private final HashMap<String, Integer> componentIDs = new HashMap<String, Integer>();
  
  private final HashSet<String> componentValueNameSet = new HashSet<String>();
  
  private final HashMap<String, Integer> componentValueNameUpdateSet = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.nodeRadioIDs.clear();
    this.componentIDs.clear();
    this.componentValueNameSet.clear();
    this.componentValueNameUpdateSet.clear();
    final List<Node> nodes = IteratorExtensions.<Node>toList(Iterators.<Node>filter(input.getAllContents(), Node.class));
    for (int i = 0; (i < nodes.size()); i++) {
      this.nodeRadioIDs.put(nodes.get(i).getName(), this.createID(i));
    }
    final Procedure1<Node> _function = (Node it) -> {
      it.getComponents().addAll(it.getComponents());
    };
    IteratorExtensions.<Node>forEach(Iterators.<Node>filter(input.getAllContents(), Node.class), _function);
    int id = 0;
    Iterable<Node> _iterable = IteratorExtensions.<Node>toIterable(Iterators.<Node>filter(input.getAllContents(), Node.class));
    for (final Node node : _iterable) {
      for (int i = 0; (i < node.getComponents().size()); i++) {
        String _name = node.getName();
        String _name_1 = node.getComponents().get(i).getName();
        String _plus = (_name + _name_1);
        int _plusPlus = id++;
        this.componentIDs.put(_plus, Integer.valueOf(_plusPlus));
      }
    }
    String _string = this.nodeRadioIDs.toString();
    String _plus = (_string + "\n");
    String _string_1 = this.componentIDs.toString();
    String _plus_1 = (_plus + _string_1);
    fsa.generateFile("ids.txt", _plus_1);
    final Procedure1<Node> _function_1 = (Node it) -> {
      this.createFileAndClean(it, input, fsa);
    };
    IteratorExtensions.<Node>forEach(Iterators.<Node>filter(input.getAllContents(), Node.class), _function_1);
  }
  
  public String createID(final int i) {
    try {
      if ((i == 0)) {
        return "00";
      } else {
        if ((i < 6)) {
          int first = (i % 6);
          return ("0" + Integer.valueOf(first));
        } else {
          if ((i < 156)) {
            String id = ((("0" + Integer.valueOf((((i - 6) / 25) << 0))) + Integer.valueOf((((i - 1) % 5) + 1))) + Integer.valueOf(((((((i - 1) / 5) << 0) - 1) % 5) + 1)));
            char _charAt = id.charAt(1);
            char _charAt_1 = "0".charAt(0);
            boolean _equals = (_charAt == _charAt_1);
            if (_equals) {
              return id.substring(1);
            }
            return id;
          } else {
            throw new Exception("Input out of range, more than 156 nodes are not supported");
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void createFileAndClean(final Node node, final Resource input, final IFileSystemAccess2 fsa) {
    String _name = node.getName();
    String _plus = (_name + ".ino");
    fsa.generateFile(_plus, this.generateNodeFile(node, input, fsa));
    this.componentValueNameSet.clear();
    this.componentValueNameUpdateSet.clear();
  }
  
  public CharSequence generateNodeFile(final Node node, final Resource input, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Generated file, do not edit");
    _builder.newLine();
    _builder.append("// ");
    String _name = node.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("#include <SPI.h>");
    _builder.newLine();
    _builder.append("#include <RF24Network.h>");
    _builder.newLine();
    _builder.append("#include <RF24.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef union {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("unsigned char byteval[4];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("float floatval;");
    _builder.newLine();
    _builder.append("} FloatByte;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("typedef union {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("unsigned char byteval[2];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int intval;");
    _builder.newLine();
    _builder.append("} IntByte;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void writeBuffer(FloatByte value, char buf[6]){");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buf[2] = value.byteval[0];");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buf[3] = value.byteval[1];");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buf[4] = value.byteval[2];");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buf[5] = value.byteval[3];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void writeBuffer(IntByte value, char buf[6]){");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buf[0] = value.byteval[0];");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buf[1] = value.byteval[1];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("float mapfloat(float x, float in_min, float in_max, float out_min, float out_max)");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Radio variables");
    _builder.newLine();
    _builder.append("RF24 radio(7,8);");
    _builder.newLine();
    _builder.append("RF24Network network(radio);");
    _builder.newLine();
    _builder.append("const uint16_t this_node = ");
    String _get = this.nodeRadioIDs.get(node.getName());
    _builder.append(_get);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//local outputComponents");
    _builder.newLine();
    {
      EList<Component> _components = node.getComponents();
      for(final Component component : _components) {
        _builder.append("int ");
        String _name_1 = component.getName();
        _builder.append(_name_1);
        _builder.append("Pin = ");
        {
          boolean _equals = component.getProperties().getType().equals("analog");
          if (_equals) {
            _builder.append("A");
          }
        }
        int _pin = component.getProperties().getPin();
        _builder.append(_pin);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          String _io = component.getProperties().getIo();
          boolean _equals_1 = Objects.equal(_io, "input");
          if (_equals_1) {
            _builder.append("const long ");
            String _name_2 = component.getName();
            _builder.append(_name_2);
            _builder.append("Rate = ");
            Rate _rate = component.getProperties().getRate();
            int _value = 0;
            if (_rate!=null) {
              _value=_rate.getValue();
            }
            _builder.append(_value);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("long ");
            String _name_3 = component.getName();
            _builder.append(_name_3);
            _builder.append("LastTransfer = 0;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("//Incoming components");
    _builder.newLine();
    {
      Iterable<Rule> _iterable = IteratorExtensions.<Rule>toIterable(Iterators.<Rule>filter(input.getAllContents(), Rule.class));
      for(final Rule rule : _iterable) {
        {
          final Function1<Assignment, Boolean> _function = (Assignment it) -> {
            String _name_4 = it.getAttribute().getName().getName();
            String _name_5 = node.getName();
            return Boolean.valueOf(Objects.equal(_name_4, _name_5));
          };
          Assignment _findFirst = IterableExtensions.<Assignment>findFirst(rule.getBody().getAssignment(), _function);
          boolean _tripleNotEquals = (_findFirst != null);
          if (_tripleNotEquals) {
            {
              Expression _left = rule.getCondition().getLeft();
              if ((_left instanceof Attribute)) {
                {
                  String _string = this.valueOf(rule.getCondition().getLeft()).toString();
                  Expression _left_1 = rule.getCondition().getLeft();
                  String _name_4 = ((Attribute) _left_1).getName().getName();
                  Object _valueOf = this.valueOf(rule.getCondition().getLeft());
                  String _plus = (_name_4 + _valueOf);
                  Integer _get_1 = this.componentIDs.get(_plus);
                  String _plus_1 = (_string + _get_1);
                  String _plus_2 = (_plus_1 + "Value");
                  boolean _add = this.componentValueNameSet.add(_plus_2);
                  if (_add) {
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      for(final String variable : this.componentValueNameSet) {
        _builder.append("float ");
        _builder.append(variable);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("void setup() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Radio");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("radio.begin();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("network.begin(90, this_node);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void loop() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("network.update();");
    _builder.newLine();
    {
      final Function1<Rule, Boolean> _function_1 = (Rule it) -> {
        final Function1<Assignment, Boolean> _function_2 = (Assignment it_1) -> {
          String _name_5 = it_1.getAttribute().getName().getName();
          String _name_6 = node.getName();
          return Boolean.valueOf(Objects.equal(_name_5, _name_6));
        };
        Assignment _findFirst_1 = IterableExtensions.<Assignment>findFirst(it.getBody().getAssignment(), _function_2);
        return Boolean.valueOf((_findFirst_1 != null));
      };
      boolean _exists = IterableExtensions.<Rule>exists(IteratorExtensions.<Rule>toIterable(Iterators.<Rule>filter(input.getAllContents(), Rule.class)), _function_1);
      if (_exists) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("while (network.available()) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("RF24NetworkHeader header;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("char buff[6];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("network.read(header, &buff, sizeof(buff));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("IntByte id;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("id.byteval[0] = buff[0];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("id.byteval[1] = buff[1];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("FloatByte value;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("value.byteval[0] = buff[2];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("value.byteval[1] = buff[3];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("value.byteval[2] = buff[4];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("value.byteval[3] = buff[5];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.newLine();
        {
          Iterable<Rule> _iterable_1 = IteratorExtensions.<Rule>toIterable(Iterators.<Rule>filter(input.getAllContents(), Rule.class));
          for(final Rule rule_1 : _iterable_1) {
            {
              final Function1<Assignment, Boolean> _function_2 = (Assignment it) -> {
                String _name_5 = it.getAttribute().getName().getName();
                String _name_6 = node.getName();
                return Boolean.valueOf(Objects.equal(_name_5, _name_6));
              };
              Assignment _findFirst_1 = IterableExtensions.<Assignment>findFirst(rule_1.getBody().getAssignment(), _function_2);
              boolean _tripleNotEquals_1 = (_findFirst_1 != null);
              if (_tripleNotEquals_1) {
                {
                  Expression _left_2 = rule_1.getCondition().getLeft();
                  if ((_left_2 instanceof Attribute)) {
                    {
                      String _string_1 = this.valueOf(rule_1.getCondition().getLeft()).toString();
                      Expression _left_3 = rule_1.getCondition().getLeft();
                      String _name_5 = ((Attribute) _left_3).getName().getName();
                      Object _valueOf_1 = this.valueOf(rule_1.getCondition().getLeft());
                      String _plus_3 = (_name_5 + _valueOf_1);
                      Integer _get_2 = this.componentIDs.get(_plus_3);
                      String _plus_4 = (_string_1 + _get_2);
                      String _plus_5 = (_plus_4 + "Value");
                      Expression _left_4 = rule_1.getCondition().getLeft();
                      String _name_6 = ((Attribute) _left_4).getName().getName();
                      Object _valueOf_2 = this.valueOf(rule_1.getCondition().getLeft());
                      String _plus_6 = (_name_6 + _valueOf_2);
                      Integer _put = this.componentValueNameUpdateSet.put(_plus_5, this.componentIDs.get(_plus_6));
                      boolean _tripleEquals = (_put == null);
                      if (_tripleEquals) {
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          Set<Map.Entry<String, Integer>> _entrySet = this.componentValueNameUpdateSet.entrySet();
          for(final Map.Entry<String, Integer> variable_1 : _entrySet) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("if(id.intval == ");
            Integer _value_1 = variable_1.getValue();
            _builder.append(_value_1, "\t\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            String _key = variable_1.getKey();
            _builder.append(_key, "\t\t\t");
            _builder.append(" = value.floatval;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        {
          Iterable<Rule> _iterable_2 = IteratorExtensions.<Rule>toIterable(Iterators.<Rule>filter(input.getAllContents(), Rule.class));
          for(final Rule rule_2 : _iterable_2) {
            {
              final Function1<Assignment, Boolean> _function_3 = (Assignment it) -> {
                String _name_7 = it.getAttribute().getName().getName();
                String _name_8 = node.getName();
                return Boolean.valueOf(Objects.equal(_name_7, _name_8));
              };
              Assignment _findFirst_2 = IterableExtensions.<Assignment>findFirst(rule_2.getBody().getAssignment(), _function_3);
              boolean _tripleNotEquals_2 = (_findFirst_2 != null);
              if (_tripleNotEquals_2) {
                _builder.append("\t");
                {
                  Expression _left_5 = rule_2.getCondition().getLeft();
                  if ((_left_5 instanceof Attribute)) {
                    _builder.append("if (id.intval == ");
                    Expression _left_6 = rule_2.getCondition().getLeft();
                    String _name_7 = ((Attribute) _left_6).getName().getName();
                    Expression _left_7 = rule_2.getCondition().getLeft();
                    String _name_8 = ((Attribute) _left_7).getComponent().getName();
                    String _plus_7 = (_name_7 + _name_8);
                    Integer _get_3 = this.componentIDs.get(_plus_7);
                    _builder.append(_get_3, "\t");
                    _builder.append(") {");
                  }
                }
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if (");
                Object _valueOf_3 = this.valueOf(rule_2.getCondition().getLeft());
                _builder.append(_valueOf_3, "\t\t");
                {
                  Expression _left_8 = rule_2.getCondition().getLeft();
                  if ((_left_8 instanceof Attribute)) {
                    Expression _left_9 = rule_2.getCondition().getLeft();
                    String _name_9 = ((Attribute) _left_9).getName().getName();
                    Object _valueOf_4 = this.valueOf(rule_2.getCondition().getLeft());
                    String _plus_8 = (_name_9 + _valueOf_4);
                    Integer _get_4 = this.componentIDs.get(_plus_8);
                    _builder.append(_get_4, "\t\t");
                  }
                }
                {
                  Expression _left_10 = rule_2.getCondition().getLeft();
                  if ((_left_10 instanceof Attribute)) {
                    _builder.append("Value ");
                  }
                }
                _builder.append(" ");
                String _operator = rule_2.getCondition().getOperator();
                _builder.append(_operator, "\t\t");
                _builder.append(" ");
                Object _valueOf_5 = this.valueOf(rule_2.getCondition().getRight());
                _builder.append(_valueOf_5, "\t\t");
                _builder.append(") {");
                _builder.newLineIfNotEmpty();
                {
                  final Function1<Assignment, Boolean> _function_4 = (Assignment it) -> {
                    String _name_10 = it.getAttribute().getName().getName();
                    String _name_11 = node.getName();
                    return Boolean.valueOf(Objects.equal(_name_10, _name_11));
                  };
                  Iterable<Assignment> _filter = IterableExtensions.<Assignment>filter(rule_2.getBody().getAssignment(), _function_4);
                  for(final Assignment myAssignment : _filter) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("digitalWrite(");
                    String _name_10 = myAssignment.getAttribute().getComponent().getName();
                    _builder.append(_name_10, "\t\t\t");
                    _builder.append("Pin, ");
                    Object _valueOf_6 = this.valueOf(myAssignment.getValue());
                    _builder.append(_valueOf_6, "\t\t\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                {
                  Expression _left_11 = rule_2.getCondition().getLeft();
                  if ((_left_11 instanceof Attribute)) {
                    _builder.append("}");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("//Sample and Transmit sensor data");
    _builder.newLine();
    {
      final Function1<Component, Boolean> _function_5 = (Component it) -> {
        String _io_1 = it.getProperties().getIo();
        return Boolean.valueOf(Objects.equal(_io_1, "input"));
      };
      Iterable<Component> _filter_1 = IterableExtensions.<Component>filter(node.getComponents(), _function_5);
      for(final Component component_1 : _filter_1) {
        _builder.append("\t");
        _builder.append("if(millis() > ");
        String _name_11 = component_1.getName();
        _builder.append(_name_11, "\t");
        _builder.append("LastTransfer + ");
        String _name_12 = component_1.getName();
        _builder.append(_name_12, "\t");
        _builder.append("Rate){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("char buff[6];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("IntByte id;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("id.intval = ");
        String _name_13 = node.getName();
        String _name_14 = component_1.getName();
        String _plus_9 = (_name_13 + _name_14);
        Integer _get_5 = this.componentIDs.get(_plus_9);
        _builder.append(_get_5, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("writeBuffer(id, buff);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("FloatByte value;");
        _builder.newLine();
        {
          dk.sdu.mdsd.arduinoDSL.Map _map = component_1.getProperties().getMap();
          boolean _tripleNotEquals_3 = (_map != null);
          if (_tripleNotEquals_3) {
            {
              String _type = component_1.getProperties().getType();
              boolean _equals_2 = Objects.equal(_type, "analog");
              if (_equals_2) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("value.floatval = mapfloat(analogRead(");
                String _name_15 = component_1.getName();
                _builder.append(_name_15, "\t\t");
                _builder.append("Pin), ");
                float _low = component_1.getProperties().getMap().getIn().getLow();
                _builder.append(_low, "\t\t");
                _builder.append(", ");
                float _high = component_1.getProperties().getMap().getIn().getHigh();
                _builder.append(_high, "\t\t");
                _builder.append(", ");
                float _low_1 = component_1.getProperties().getMap().getOut().getLow();
                _builder.append(_low_1, "\t\t");
                _builder.append(", ");
                float _high_1 = component_1.getProperties().getMap().getOut().getHigh();
                _builder.append(_high_1, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("value.floatval = mapfloat(digitalRead(");
                String _name_16 = component_1.getName();
                _builder.append(_name_16, "\t\t");
                _builder.append("Pin), ");
                float _low_2 = component_1.getProperties().getMap().getIn().getLow();
                _builder.append(_low_2, "\t\t");
                _builder.append(", ");
                float _high_2 = component_1.getProperties().getMap().getIn().getHigh();
                _builder.append(_high_2, "\t\t");
                _builder.append(", ");
                float _low_3 = component_1.getProperties().getMap().getOut().getLow();
                _builder.append(_low_3, "\t\t");
                _builder.append(", ");
                float _high_3 = component_1.getProperties().getMap().getOut().getHigh();
                _builder.append(_high_3, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              String _type_1 = component_1.getProperties().getType();
              boolean _equals_3 = Objects.equal(_type_1, "analog");
              if (_equals_3) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("value.floatval = analogRead(");
                String _name_17 = component_1.getName();
                _builder.append(_name_17, "\t\t");
                _builder.append("Pin);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("value.floatval = digitalRead(");
                String _name_18 = component_1.getName();
                _builder.append(_name_18, "\t\t");
                _builder.append("Pin);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("writeBuffer(value, buff);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("//Send data ");
        _builder.newLine();
        {
          final Function1<Rule, Boolean> _function_6 = (Rule it) -> {
            Expression _left_12 = it.getCondition().getLeft();
            Component _component = null;
            if (((Attribute) _left_12)!=null) {
              _component=((Attribute) _left_12).getComponent();
            }
            return Boolean.valueOf(Objects.equal(_component, component_1));
          };
          Iterable<Rule> _iterable_3 = IteratorExtensions.<Rule>toIterable(IteratorExtensions.<Rule>filter(Iterators.<Rule>filter(input.getAllContents(), Rule.class), _function_6));
          for(final Rule rule_3 : _iterable_3) {
            _builder.append("\t");
            _builder.append("\t");
            final HashSet<Node> exist = new HashSet<Node>();
            _builder.newLineIfNotEmpty();
            {
              EList<Assignment> _assignment = rule_3.getBody().getAssignment();
              for(final Assignment assignment : _assignment) {
                {
                  boolean _add_1 = exist.add(assignment.getAttribute().getName());
                  if (_add_1) {
                    {
                      boolean _equals_4 = assignment.getAttribute().getName().getName().equals(node.getName());
                      boolean _not = (!_equals_4);
                      if (_not) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("forceSend(");
                        String _get_6 = this.nodeRadioIDs.get(assignment.getAttribute().getName().getName());
                        _builder.append(_get_6, "\t\t");
                        _builder.append(", buff, sizeof(buff));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        {
                          String _type_2 = assignment.getAttribute().getComponent().getProperties().getType();
                          boolean _equals_5 = Objects.equal(_type_2, "analog");
                          if (_equals_5) {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("analogWrite(");
                            String _name_19 = assignment.getAttribute().getComponent().getName();
                            _builder.append(_name_19, "\t\t");
                            _builder.append("Pin, ");
                            Object _valueOf_7 = this.valueOf(assignment.getValue());
                            _builder.append(_valueOf_7, "\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("digitalWrite(");
                            String _name_20 = assignment.getAttribute().getComponent().getName();
                            _builder.append(_name_20, "\t\t");
                            _builder.append("Pin, ");
                            Object _valueOf_8 = this.valueOf(assignment.getValue());
                            _builder.append(_valueOf_8, "\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _name_21 = component_1.getName();
        _builder.append(_name_21, "\t\t");
        _builder.append("LastTransfer = millis();\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void forceSend(uint16_t addressOfReceiver, char buff[], int bufferLength){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("RF24NetworkHeader header(addressOfReceiver);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bool ok = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while(!ok){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ok = network.write(header, buff, sizeof(buff));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public Object valueOf(final Object x) {
    Object _xblockexpression = null;
    {
      System.out.println(x);
      Object _switchResult = null;
      boolean _matched = false;
      if (x instanceof Attribute) {
        _matched=true;
        _switchResult = ((Attribute)x).getComponent().getName();
      }
      if (!_matched) {
        if (x instanceof NumberLiteral) {
          _matched=true;
          Object _xifexpression = null;
          String _float = ((NumberLiteral)x).getFloat();
          boolean _tripleNotEquals = (_float != null);
          if (_tripleNotEquals) {
            _xifexpression = ((NumberLiteral)x).getFloat();
          } else {
            _xifexpression = Integer.valueOf(((NumberLiteral)x).getInt());
          }
          _switchResult = ((Object)_xifexpression);
        }
      }
      if (!_matched) {
        if (x instanceof State) {
          _matched=true;
          int _xifexpression = (int) 0;
          String _value = ((State)x).getValue();
          boolean _equals = Objects.equal(_value, "on");
          if (_equals) {
            _xifexpression = 1;
          } else {
            _xifexpression = 0;
          }
          _switchResult = Integer.valueOf(_xifexpression);
        }
      }
      _xblockexpression = ((Object)_switchResult);
    }
    return _xblockexpression;
  }
}
