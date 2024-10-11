package com.example.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    // POST /coupons - Create a new coupon
    @PostMapping("/save")
    public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon) {
        return ResponseEntity.ok(couponService.createCoupon(coupon));
    }

    // GET /coupons - Retrieve all coupons
    @GetMapping("/getCoupons")
    public ResponseEntity<List<Coupon>> getAllCoupons() {
        return ResponseEntity.ok(couponService.getAllCoupons());
    }

    // GET /coupons/{id} - Retrieve a coupon by ID
    @GetMapping("/getById")
    public ResponseEntity<Coupon> getCouponById(@RequestParam String id) {
        Coupon coupon = couponService.getCouponById(id);
        if (coupon == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(coupon);
    }

    // PUT /coupons/{id} - Update a coupon by ID
    @PutMapping("/{id}")
    public ResponseEntity<Coupon> updateCoupon(@PathVariable String id, @RequestBody Coupon coupon) {
        Coupon updatedCoupon = couponService.updateCoupon(id, coupon);
        if (updatedCoupon == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedCoupon);
    }


    // DELETE /coupons/{id} - Delete a coupon by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCoupon(@PathVariable String id) {
        couponService.deleteCoupon(id);
        return ResponseEntity.noContent().build();
    }

    // POST /applicable-coupons - Fetch applicable coupons and calculate discounts for a cart
    @PostMapping("/applicable-coupons")
    public ResponseEntity<?> getApplicableCoupons(@RequestBody Cart cart) {
        // Business logic to check applicable coupons for the given cart
        return ResponseEntity.ok().build();
    }

    // POST /apply-coupon/{id} - Apply a coupon to the cart
    @PostMapping("/apply-coupon/{id}")
    public ResponseEntity<?> applyCoupon(@PathVariable String id, @RequestBody Cart cart) {
        // Business logic to apply a coupon and update the cart
        return ResponseEntity.ok().build();
    }
}

