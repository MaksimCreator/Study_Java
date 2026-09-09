package FirstBlock.Tasks;

public class TextBuilder {
    private final StringBuilder stringBuilder = new StringBuilder();

    private void ResetBuilder() { stringBuilder.setLength(0); }

    public void print() {
        IO.println(stringBuilder.toString());
        ResetBuilder();
    }

    public String getLine() {
        String line = stringBuilder.toString();
        ResetBuilder();
        return line;
    }

    public TextBuilder append(Object object)
    {
        stringBuilder.append(object);
        return this;
    }

    public TextBuilder append(char value)
    {
        stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(int value) {
        stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(String line) {
        stringBuilder.append(line);
        return this;
    }

    public TextBuilder append(float value) {
        stringBuilder.append(value);
        return this;
    }

    public TextBuilder append(double value) {
        stringBuilder.append(value);
        return this;
    }
}
