package pertemuan602;

/**
 *
 * @author Liryana Purnama
 * 26-04-2025
 */
public class LuasPersegi {
    private int sisi;
    
    public LuasPersegi(int ss){
        this.sisi = ss;
    }
    
    public int HL(){
        int luas;
        luas = sisi * sisi;
        return luas;
    }
}
