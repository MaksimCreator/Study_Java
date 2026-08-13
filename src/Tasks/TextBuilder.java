package Tasks;

public class TextBuilder
{
    private final StringBuilder _stringBuilder = new StringBuilder();

    private void ResetBuilder() { _stringBuilder.setLength(0); }

    public void Print()
    {
        IO.println(_stringBuilder.toString());
        ResetBuilder();
    }

    public TextBuilder append(Object object)
    {
        _stringBuilder.append(object);
        return this;
    }

    public TextBuilder append(int value)
    {
        _stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(String value)
    {
        _stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(float value)
    {
        _stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(double value)
    {
        _stringBuilder.append(value);
        return this;
    }
}
