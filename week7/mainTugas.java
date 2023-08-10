
package jobsheet7;

/**
 *
 * @author Bedman
 */
public class mainTugas {
    public static void main(String[] args) {
        Mac m = new Mac();
        m.merk="Apple HDC";
        m.kecProc=3;
        m.sizeMemo=1024;
        m.jnsProc="AMD Ryzen-5";
        m.jnsBaterai="Lithium-ion 4000mAh";
        m.security="Apple Security Agent";
        m.tampilMac();
        
        Pc p = new Pc();
        p.merk="Dell";
        p.kecProc=2;
        p.sizeMemo=512;
        p.jnsProc="Intel-3";
        p.ukuranMonitor=21;
        p.tampilPc();
        
        Windows w = new Windows();
        w.merk="Windows-10";
        w.kecProc=3;
        w.sizeMemo=1024;
        w.jnsProc="Intel-5";
        w.jnsBaterai="Lithium-ion 5000mAh";
        w.fitur="Cortana";
        w.tampilWindows();
    }
}
