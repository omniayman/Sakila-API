package org.example.webServices;

import jakarta.jws.WebService;
import org.example.Mappers.RentalMapper;
import org.example.Mappers.customer.CustomerMapper;
import org.example.Mappers.staff.StaffMapper;
import org.example.dtos.RentalDto;
import org.example.dtos.Staff.StaffDto;
import org.example.dtos.customer.CustomerDto;
import org.example.dtos.payment.PaymentDto;
import org.example.services.PaymentService;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class Payment {
    PaymentService paymentService = new PaymentService();

    public List<PaymentDto> getAllPayments() {

        return paymentService.getAllPayments();
    }

    public PaymentDto getPaymentById(int id) {

        return paymentService.getPaymentById(id);
    }


    public void updatePayment(PaymentDto paymentDto) {


        paymentService.updatePayment(paymentDto);
    }

    public void addPayment(PaymentDto paymentDto) {

        paymentService.addPayment(paymentDto);
    }

    public CustomerDto getCustomerByPayment(int id) {
        return paymentService.getCustomerByPayment(id);
    }


    public RentalDto getRentalByPayment(int id) {
        return paymentService.getRentalByPayment(id);
    }


    public BigDecimal getMaxPayment() {
        return paymentService.getMaxPayment();
    }


    public StaffDto getStaffByPayment(int id) {

        return paymentService.getStaffByPayment(id);
    }
}
