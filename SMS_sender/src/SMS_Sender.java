
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SMS_Sender {
	public static void main(String[] args) throws Exception {
		String message = "saiKiran";
		String phone = "9160200326";
		String username = "balu";
		String password = "1234";
		String address = "http://192.168.1.4";
		String port = "8090";
		URL url = new URL(address + ":" + port + "/SendSMS?username=" + username + "&password=" + password + "&phone="
				+ phone + "&message=" + URLEncoder.encode(message, "UTF-8"));
		URLConnection connection=url.openConnection();
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while((inputLine=bufferedReader.readLine())!=null) {
	   System.out.println(inputLine);
	  }
		bufferedReader.close();
		

	}

}
