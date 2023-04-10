public class BackupDancer extends Artist implements IBackup {
    /**
     * constructor of BackupDancer
     * @param name
     */
    public BackupDancer(String name){
        super(name);
    }

    public void dance(){
        System.out.println("This is the method dance in the class BackupDancer");
    }
    
    @Override
    public void backup(){
        dance();
    }


    
}
