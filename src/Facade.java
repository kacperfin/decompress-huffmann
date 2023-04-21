import com.kacperfin.compressor.Compressor;
import com.kacperfin.decompressor.Decompressor;
public class Facade {

    public static int compress(String input_name) throws Exception {
        return Compressor.compress(input_name);
    }

    public static int decompress(String input_name, String output_name) throws Exception {
        return Decompressor.decompress(input_name, output_name);
    }

}
