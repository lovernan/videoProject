package cn.whxlover.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * ������д WebAPI �ӿڵ���ʾ��
 * 
 * ���з�����ֱ������ main() ����
 * 
 * ����� ����̨���������д�����Ϣ
 * 
 * @author iflytek
 * 
 */
public class WebIAT implements audio{
	// �ϳ�webapi�ӿڵ�ַ
	private static final String WEBIAT_URL = "http://api.xfyun.cn/v1/service/v1/iat";
	// Ӧ��ID
	private static final String APPID = "5c773da0";
	
	
	// �ӿ���Կ
	private static final String API_KEY = "7e784dba1dfe86dad6fe3d95189a7bfe";
	
	// ��Ƶ����
	private static final String AUE = "raw";
	// ��������
	private static final String ENGINE_TYPE = "sms16k";

	// ��˵�
	private static final String VAD_EOS = "10000";
	
	// ��Ƶ�ļ���ַ
	//private static final String AUDIO_PATH = "G:\\upload\\612d18a4-fc71-4533-b6de-26bc45a1a637.pcm";
	
	/**
	 * ��װhttp����ͷ
	 */
	private static Map<String, String> buildHttpHeader() throws UnsupportedEncodingException {
		String curTime = System.currentTimeMillis() / 1000L + "";
		String param = "{\"aue\":\""+AUE+"\""+",\"engine_type\":\"" + ENGINE_TYPE + "\""+",\"vad_eos\":\"" + VAD_EOS + "\"}";
		String paramBase64 = new String(Base64.encodeBase64(param.getBytes("UTF-8")));
		String checkSum = DigestUtils.md5Hex(API_KEY + curTime + paramBase64);
		Map<String, String> header = new HashMap<String, String>();
		header.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
		header.put("X-Param", paramBase64);
		header.put("X-CurTime", curTime);
		header.put("X-CheckSum", checkSum);
		header.put("X-Appid", APPID);
		return header;
	}

	@Override
	public String audio(String AUDIO_PATH) {
		Map<String, String> header;
		String result = "";
		try {
			header = buildHttpHeader();
			byte[] audioByteArray = FileUtil.read(AUDIO_PATH);
			String audioBase64 = new String(Base64.encodeBase64(audioByteArray), "UTF-8");
			result = HttpUtil.doPost1(WEBIAT_URL, header, "audio=" + URLEncoder.encode(audioBase64, "ISO-8859-1"));
			System.out.println("��д WebAPI �ӿڵ��ý����" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
