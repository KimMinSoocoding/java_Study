package chapter12;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class StringQuiz {
	public static void main(String[] args) throws MalformedURLException {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B3%B4%EB%8D%94%EC%BD%9C%EB%A6%AC";
		
//		String tmp = url;
//		System.out.println(url.substring(0,url.indexOf("://")));
//		
//		String protocol = url.substring(0,url.indexOf("://"));
//		tmp = tmp.substring(url.indexOf("://")+3);
//		
////		System.out.println(tmp);
//		String domain = tmp.substring(0,tmp.indexOf("/"));
//		tmp = tmp.substring(tmp.indexOf("/")+1);
//		System.out.println(domain);
//		
//		String file = tmp.substring(0, tmp.indexOf("?"));
//		tmp = tmp.substring(tmp.indexOf("?")+1);
//		System.out.println(file);
////		System.out.println(tmp);
//		
//		String Qury = tmp.substring(0,tmp.indexOf("&"));
//		tmp = tmp.substring(tmp.indexOf("&")+1);
//		System.out.println(Qury);
////		System.out.println(tmp);
//		
//		String[] pair = tmp.split("&");
//		String[][] pair2 = new String[5][2];
//		System.out.println(Arrays.toString(pair));
//		
//		for(int i=0; i<pair.length; i++) {
//			pair2[i] = pair[i].split("=");
//		}
//		System.out.println(Arrays.deepToString(pair2));
		
//		Param param = new Param(url);
//		System.out.println(param);
		
		URL url2 = new URL(url);
		System.out.println(url2.getProtocol());
		System.out.println(url2.getPath());
		System.out.println(url2.getFile());
		System.out.println(url2.getHost());
		System.out.println(url2.getQuery());

	}
}

class Param {
	String protocol;
	String domain;
	String file;
	Pair[] pairs;
	
	public Param(String url) {
		String tmp = url;
		System.out.println(url.substring(0,url.indexOf("://")));
		
		protocol = url.substring(0,url.indexOf("://"));
		tmp = tmp.substring(url.indexOf("://")+3);
		
//		System.out.println(tmp);
		domain = tmp.substring(0,tmp.indexOf("/"));
		tmp = tmp.substring(tmp.indexOf("/")+1);
		System.out.println(domain);
		
		file = tmp.substring(0, tmp.indexOf("?"));
		tmp = tmp.substring(tmp.indexOf("?")+1);
		System.out.println(file);
//		System.out.println(tmp);
		
		String Qury = tmp.substring(0,tmp.indexOf("&"));
		tmp = tmp.substring(tmp.indexOf("&")+1);
		System.out.println(Qury);
//		System.out.println(tmp);
		
		String[] pair = tmp.split("&");
		pairs = new Pair[pair.length];
		
		for(int i=0; i<pair.length; i++) {
			String[] tmps = pair[i].split("=");
			pairs[i] = new Pair(tmps[0], tmps[1]);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Param [protocol=" + protocol + ", domain=" + domain + ", file=" + file + ", pairs="
				+ Arrays.toString(pairs) + "]";
	}

	class Pair {
		String key; 
		String value;
		public Pair(String key, String value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
		
	}
}
