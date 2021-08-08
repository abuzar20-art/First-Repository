package max.bo;

import java.util.Random;

import max.bean.SGHMemberBEan;
import max.bean.SHGBean;
import max.dao.SHGDAO;
import max.dto.SHGBeanDTO;
import max.dto.SHGMemberDTO;

public class SHGDetailBO {
	
	public boolean getSHGDetails(SHGBean shgBean, SGHMemberBEan sghMemberBEan)
	{
		SHGBeanDTO sHGBeanDTO=new SHGBeanDTO();
		SHGMemberDTO sHGMemberDTO=new SHGMemberDTO();
		String n = shgBean.getGname();
		if(n.length()>2)
		{
			
			sHGBeanDTO.setAccountNo(shgBean.getAccountNo());
			sHGBeanDTO.setCreatedDate(shgBean.getCreatedDate());
			sHGBeanDTO.setGname(shgBean.getGname());
			sHGBeanDTO.setShg_application_no(generateSHGNo());
			sHGMemberDTO.setCname(sghMemberBEan.getCname());
			sHGMemberDTO.setAge(sghMemberBEan.getAge());
			sHGMemberDTO.setCadhar(sghMemberBEan.getCadhar());
		}
		
		
		return new SHGDAO().insertSHGDetails(sHGBeanDTO, sHGMemberDTO);
		
	}

	
	public static String generateSHGNo()
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<=9; i++)
		{
			sb.append(new Random().nextInt(10));
		}
		return "SHG"+"_"+sb.substring(0,6);
		
	}
}
