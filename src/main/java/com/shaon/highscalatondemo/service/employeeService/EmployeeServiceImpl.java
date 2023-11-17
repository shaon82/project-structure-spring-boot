package com.shaon.highscalatondemo.service.employeeService;

import com.shaon.highscalatondemo.model.employee.Employee;
import com.shaon.highscalatondemo.model.employee.EmployeeDto;
import com.shaon.highscalatondemo.objectMapper.ObjectMapperUtils;
import com.shaon.highscalatondemo.repository.employeeRepository.EmployeeRepository;
import org.aspectj.weaver.ast.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto getById(String id) {
        Employee employee =  employeeRepository.findById(id).get();
        return new ObjectMapperUtils().map(employee,EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> findAll() {
        return null;
    }

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = new ObjectMapperUtils().map(employeeDto,Employee.class);
        Employee employee1 = employeeRepository.save(employee);
        return new ObjectMapperUtils().map(employee1,EmployeeDto.class);
    }

    @Override
    public void delete(EmployeeDto employee) {

    }
}
