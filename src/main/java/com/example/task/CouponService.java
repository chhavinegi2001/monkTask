package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    // Create a new coupon
    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    // Retrieve all coupons
    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    // Retrieve a coupon by ID
    public Coupon getCouponById(String id) {
        return couponRepository.findById(id).orElse(null);
    }
    public Coupon updateCoupon(String id, Coupon coupon) {
        Coupon existingCoupon = couponRepository.findById(id).orElse(null);
        if (existingCoupon != null) {
            existingCoupon.setType(coupon.getType());
            existingCoupon.setDetails(coupon.getDetails());
            return couponRepository.save(existingCoupon);
        }
        return null;
    }


    // Delete a coupon by ID
    public void deleteCoupon(String id) {
        couponRepository.deleteById(id);
    }
}

