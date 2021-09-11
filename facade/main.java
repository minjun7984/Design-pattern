import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpCilent;
import com.company.design.facade.Writer;

public class Main {

    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.foo.ck.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisConnect();
        ftpClient.disConnect();

        SftpCilent sftpClient = new SftpCilent("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
        }
    }
