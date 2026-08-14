package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class FirstTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final int variableInt = 1;
    private final byte variableByte = 2;
    private final short variablShort = 3;
    private final long variablLong = 4L;
    private final float variablFloat = 5f;
    private final double variablDouble = 6;

    public void Print()
    {
        Print("_int",variableInt);
        Print("_byte",variableByte);
        Print("_short",variablShort);
        Print("_long",variablLong);
        Print("_float",variablFloat);
        Print("_double",variablDouble);
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
