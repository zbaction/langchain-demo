package top.zbaction.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.zbaction.pojo.Appointment;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}