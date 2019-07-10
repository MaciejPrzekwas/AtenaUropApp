package atn.sopot.enumStatus;

public enum Status {
    CANCELED("Canceled"), PLANNED("Planned"), APPROVED ("Approved");

    private String name;

    Status(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
