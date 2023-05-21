package com.ShubhamAmande.Userservice.Service;


import com.ShubhamAmande.Userservice.Entity.Custom_User;
import com.ShubhamAmande.Userservice.Repo.UserRepo;
import com.ShubhamAmande.Userservice.VO.Department;
import com.ShubhamAmande.Userservice.VO.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate rt;


    public Custom_User saveUser(Custom_User user) {
        log.info("inside user save method of User Service");
    return userRepo.save(user);
    }

    public ResponseTemplateVo getUserWithDepartment(Long userId) {
        log.info("inside getUserWithDepartment method of User Service");
        ResponseTemplateVo rtVO = new ResponseTemplateVo();
        Custom_User u = userRepo.findById(userId).orElse(null);
        Department dept = null;
        if(u !=null)
        {
            dept = rt.getForObject("http://DEPARTMENT-SERVICE/department/getDeptById/"+u.getUserId(),Department.class);
        }
        rtVO.setUser(u);
        rtVO.setDepartment(dept);

        return  rtVO;
    }
}
