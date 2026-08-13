package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class FirstTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final int _int = 1;
    private final byte _byte = 2;
    private final short _short = 3;
    private final long _long = 4;
    private final float _float = 5;
    private final double _double = 6;

    public void Print()
    {
        Print("_int",_int);
        Print("_byte",_byte);
        Print("_short",_short);
        Print("_long",_long);
        Print("_float",_float);
        Print("_double",_double);
    }

    private void Print(String nameVariable,Object variable)
    {
        String typeVariable = variable.getClass().getSimpleName();

        _textBuilder.append("Значение переменной ")
                .append(nameVariable)
                .append(" с типом ")
                .append(typeVariable)
                .append(" равно ")
                .append(variable);

        _textBuilder.Print();
    }
}
