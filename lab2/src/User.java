class User {
    private double id;
    private String name;
    private boolean isSpec;


    public User(double id, String name, boolean isSpec) {
        this.id = id;
        this.name = name;
        this.isSpec = isSpec;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSpec() {
        return isSpec;
    }

    public void setSpec(boolean spec) {
        isSpec = spec;
    }
}