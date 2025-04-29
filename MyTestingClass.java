public class MyTestingClass {
    private int number;
    private String name;

    public MyTestingClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 37 * hash + number;
        for (char c : name.toCharArray()) {
            hash = 37 * hash + c;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        MyTestingClass other = (MyTestingClass) obj;

        if (this.number != other.number) return false;
        return this.name.equals(other.name);
    }
}
