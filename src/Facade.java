import com.kacperfin.compressor.Compressor;
import com.kacperfin.decompressor.Decompressor;
public class Facade {

    public static int compress(String input_name) throws Exception {
        return Compressor.compress(input_name);
    }

    public static int decompress()
    {
        return Decompressor.decompress();
    }

}
