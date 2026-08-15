package Tasks;

public class TextBuilder
{
    private final StringBuilder stringBuilder = new StringBuilder();

    private void ResetBuilder() { stringBuilder.setLength(0); }

    public void Print()
    {
        IO.println(stringBuilder.toString());
        ResetBuilder();
    }

    public TextBuilder append(Object object)
    {
        stringBuilder.append(object);
        return this;
    }

    public TextBuilder append(int value)
    {
        stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(String value)
    {
        stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(float value)
    {
        stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(double value)
    {
        stringBuilder.append(value);
        return this;
    }
}
