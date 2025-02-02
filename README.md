# Dummy-Insert Tool 🚀

**Công cụ sinh dữ liệu giả và insert hàng loạt vào database**  
[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-Apache_2.0-green)](LICENSE)
[![Contributors](https://img.shields.io/github/contributors/ZeroX-Labs/dummy-insert)](https://github.com/ZeroX-Labs/dummy-insert/graphs/contributors)

## Mục đích
Công cụ này giúp tự động sinh dữ liệu giả (dummy data) và insert vào database với tốc độ cao, phục vụ cho:
- Kiểm thử hiệu năng (performance testing)
- Demo ứng dụng
- Tạo dữ liệu mẫu cho các bảng database

## Tính năng chính
- ✅ Hỗ trợ MySQL, PostgreSQL, SQLite
- ✅ Sinh dữ liệu giả theo kiểu dữ liệu (string, số, ngày tháng, v.v.)
- ✅ Tích hợp [DataFaker](https://www.datafaker.net/) để sinh dữ liệu thực tế
- ✅ Insert batch với kích thước tùy chỉnh
- ✅ Cấu hình qua file YAML hoặc CLI
- ✅ Báo cáo thống kê và logging chi tiết

## Cài đặt
### Yêu cầu
- Java 17+
- Maven 3.8+

### Build từ source
```bash
git clone https://github.com/your-username/dummy-insert.git
cd dummy-insert
mvn clean package
```
