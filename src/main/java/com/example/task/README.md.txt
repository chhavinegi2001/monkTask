# Coupon Management System

## Overview
This project is a Spring Boot application that manages and applies various types of coupons (e.g., cart-wise, product-wise, buy-x-get-y) for an e-commerce platform.

## Implemented Features
- Cart-wise discount: Apply discounts based on the total cart value.
- Product-wise discount: Apply discounts to specific products in the cart.
- Buy-X-Get-Y (BxGy) discount: Get free products after purchasing a specific quantity of other products.

## Future Enhancements
- Add coupon expiry dates.
- Support bulk coupon generation and validation.
- Enhance the coupon application logic to allow combinations of multiple coupon types.

## Assumptions
- The cart contains only products that are eligible for coupon application.
- Only one coupon is applied per transaction (for now).

## Limitations
- The current implementation doesn't handle coupon expiry dates.
- No support for combining multiple coupon types in a single transaction.
