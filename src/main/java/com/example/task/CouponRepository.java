package com.example.task;

import org.springframework.data.mongodb.repository.MongoRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends MongoRepository<Coupon, String> {
}
