/**
 * Created by William Lin on 3/29/2016.
 */
public interface iRead {

    int abc = 67;
    void OpenDB();
    void ClosedDB(java.io.BufferedInputStream bi);
    java.io.File serialize();
    java.io.File deSerialize();

}
