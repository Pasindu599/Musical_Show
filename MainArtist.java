public class MainArtist extends Artist implements ISinger {
    /**
     * constructor of MainArtist
     * @param name
     */
    public MainArtist(String name){
        super(name);
    }
    
    @Override
    public void sing(){
        System.out.println("This is the method sing in the class MainArtist.");
    }
}
