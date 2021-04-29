
public class IndexName{
    private int index;
    private String name;

    public int getIndex() {
        return index;
    }
    public String getName() {
        return name;
    }

    public IndexName(int index, String name) {
        this.index = index;
        this.name = name;
    }
    @Override
    public String toString() {
        return index+". "+name;
    }
}