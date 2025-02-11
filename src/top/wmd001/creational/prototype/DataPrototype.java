package top.wmd001.creational.prototype;

public class DataPrototype implements Cloneable {

    private final Object data;

    public DataPrototype(DataPrototype dataPrototype) {
        this.data = dataPrototype.data;
    }

    @Override
    public DataPrototype clone() {
        DataPrototype dataPrototype;
        try {
            dataPrototype = (DataPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            dataPrototype = new DataPrototype(this);
        }
        return dataPrototype;
    }
}
