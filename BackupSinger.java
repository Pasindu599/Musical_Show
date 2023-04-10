public class BackupSinger extends Artist implements IBackup, ISinger{
    /**
     * constructor of BackupSinger
     * @param name
     */
    public BackupSinger(String name){
        super(name);
    }

    
    @Override
    public void backup(){
        sing();
    }
    @Override
    public void sing(){
        System.out.println("This is the method sing in the class BackupSinger.");
    }

}