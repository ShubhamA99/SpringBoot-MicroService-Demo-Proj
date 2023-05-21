package com.ShubhamAmande.Userservice.VO;

import com.ShubhamAmande.Userservice.Entity.Custom_User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

    private Custom_User user;
    private Department department;
}
