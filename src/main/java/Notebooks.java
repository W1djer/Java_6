import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Notebooks {
    String model;
    String os;
    Integer ram;
    Integer hw;
    Integer diag;

    public Notebooks(String model, String os, Integer ram, Integer hw, Integer diag){
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.hw = hw;
        this.diag = diag;
    }

    public String toString(){
        return model + ", " + os + ", ОЗУ: " + ram + ", SSD: " + hw + ", Диагональ: " + diag;
    }
}
