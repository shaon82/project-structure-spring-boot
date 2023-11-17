package com.shaon.highscalatondemo.controller.employee;

import com.shaon.highscalatondemo.controller.BaseController;
import com.shaon.highscalatondemo.model.BaseApiResponseModel;
import com.shaon.highscalatondemo.model.employee.Employee;
import com.shaon.highscalatondemo.model.employee.EmployeeDto;
import com.shaon.highscalatondemo.service.employeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController implements BaseController<EmployeeDto> {


    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find/{id}")
    @Override
    public ResponseEntity<BaseApiResponseModel<EmployeeDto>> getById(@PathVariable String id) {
        EmployeeDto employeeDto = employeeService.getById(id);
        Optional<EmployeeDto> optionalEmployee = Optional.ofNullable(employeeDto);
        if (optionalEmployee.isPresent()){
            return ResponseEntity.ok(BaseApiResponseModel.success("Found employee.",employeeDto));
        }
        return ResponseEntity.ok(BaseApiResponseModel.error("Employee not found!"));
    }


    @GetMapping("/find-all")
    @Override
    public ResponseEntity<List<BaseApiResponseModel<EmployeeDto>>> getAll() {
        return null;
    }

    @PostMapping("/save")
    @Override
    public ResponseEntity<BaseApiResponseModel<EmployeeDto>> create(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto employeeDto1 = employeeService.save(employeeDto);
        Optional<EmployeeDto> optionalEmployeeDto = Optional.ofNullable(employeeDto1);
        if (optionalEmployeeDto.isPresent()){
            return ResponseEntity.ok(BaseApiResponseModel.success("created",employeeDto1));
        }
        return ResponseEntity.ok(BaseApiResponseModel.error("Employee is not created!"));
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity<BaseApiResponseModel<EmployeeDto>> update(@PathVariable Long id, @RequestBody EmployeeDto entity) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
