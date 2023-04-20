import com.kacperfin.compressor.Compressor;
import com.kacperfin.decompressor.Decompressor;
public class Facade {

    public static int compress()
    {
        return Compressor.compress();
    }

    public static int decompress()
    {
        return Decompressor.decompress();
    }

}
