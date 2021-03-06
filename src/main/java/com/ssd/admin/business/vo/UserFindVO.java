package com.ssd.admin.business.vo;

import com.ssd.admin.business.enums.RoleEnum;
import com.ssd.admin.business.enums.UserTypeEnum;
import lombok.Data;

/**
 * Created by zhaozhirong on 2019/9/18.
 */
@Data
public class UserFindVO {

    private Integer id;

    private String userName;

    private String nickName;

    private String roleDisplay;

    private Integer roleCode;

    private Integer organizationId;

    private String  organizationName;

    private Integer userType;


    public String getRoleDisplay(){
        if(this.roleCode != null){
            return RoleEnum.fromCode(roleCode).getDisplay();
        }
        return RoleEnum.USER.getDisplay();
    }

    public String getUserTypeStr(){
        if(this.userType != null){
            return UserTypeEnum.fromCode(userType).getDisplay();
        }
        return UserTypeEnum.TEACHER.getDisplay();
    }
}
