package max.dao;

import max.dto.SHGBeanDTO;
import max.dto.SHGMemberDTO;

public class SHGDAO {
	public boolean insertSHGDetails(SHGBeanDTO dto, SHGMemberDTO memberDTO)
	{
		try {
			
			
			
			System.out.println("dao "+dto.getGname() + "App No "+dto.getShg_application_no());
			System.out.println(memberDTO.getCname().length);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}

}
