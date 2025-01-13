package useAbstract;

public class Action {

    int tc = 0;

    public String name() {
        if (tc == 100) {
            return "Ali Bilmem";
        }else if (tc == 200) {
            return "Kemal Bil";
        }else {
            return "";
        }
    }


}
