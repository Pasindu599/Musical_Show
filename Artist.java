

public class Artist{
    private String name;
    /**
     * constructor of Artice
     * @param name
     */
    public Artist(String name){
        setName(name);
    }

    /**
     * get the value of name
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * change the value of name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
}