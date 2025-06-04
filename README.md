# Group 9 — Dự án Game 2D

## Thành viên 👥
- **Lê Phạm Thành Đạt** — 23010541  
- **Bùi Hoài Anh** — 23010294  
- **Đỗ Văn Duy** — 23017211  

---
**I - Tiêu đề**
Thiết kế và phát triển Game 2D Phiêu lưu: Lạc Trong Rừng Cấm

**CLASS DIAGRAM**
![image](https://github.com/user-attachments/assets/68b6fc70-5e0b-4a1c-a9c4-efb157201752)


II - Đối tượng
- Nhân vật chính (Main Character / Player):
Vai trò: Là đối tượng điều khiển chính trong game, do người chơi điều khiển để di chuyển, nhảy, chiến đấu và tương tác với môi trường.
Thuộc tính: Vị trí, tốc độ di chuyển, máu (HP), trạng thái (đang đứng, tấn công...), hoạt ảnh (animation).
Hành vi: Di chuyển trái/phải, tấn công, nhận sát thương, tương tác với vật phẩm hoặc NPC.

Sơ đồ Sequence Diagram — Hành vi Nhân vật chính (Player) :
![Sequence Diagram Hành vi Nhân vật chính (Player)](https://github.com/user-attachments/assets/6c6690c0-f128-4466-96fe-0eed8fad4825)


- Kẻ thù (Enemy):
Vai trò: Gây thử thách cho người chơi, tạo nên tính đối kháng và tăng độ khó.
Thuộc tính: Vị trí, sát thương, máu, phạm vi phát hiện người chơi, hoạt ảnh.
Hành vi: Tuần tra, đuổi theo người chơi, tấn công khi đến gần, chết khi hết máu.

Sơ đồ Activity Diagram — Hành vi Kẻ thù (Enemy):
![522d8907-ed9d-49c9-ae5a-c56d992e6aa7](https://github.com/user-attachments/assets/7a075773-f671-4826-a287-5cafd910447b)


- Vật phẩm (Item):
Vai trò: Hỗ trợ người chơi trong quá trình chơi game, tăng tính hấp dẫn và khám phá.
Thuộc tính: Loại vật phẩm (hồi máu, tăng tốc độ, chìa khóa...), vị trí, hiệu ứng khi nhặt.
Hành vi: Nằm cố định trên bản đồ, biến mất khi được nhặt, kích hoạt hiệu ứng hỗ trợ cho người chơi.

 Sơ đồ State Machine Diagram — Hành vi Vật phẩm (Item):
 ![tải xuống](https://github.com/user-attachments/assets/06fedcad-e97b-494d-a647-0462ed6c11ea)



III - Cấu trúc Folder.

Gồm có 2 folder: scr (source code), res (resource).

Trong scr gồm có các lớp:
- characters: Class cho nhân vật, kẻ thù
- items: Class cho vật phẩm
- tests: Kiểm định
- Main: Lớp chính để chạy game

Trong res gồm có:
- images: hình ảnh
- sounds: âm thanh
- maps: bản đồ

IV - P4
1. Giao diện:
Sử dụng Java Spring Boot với Thymeleaf hoặc REST API + Swagger/Postman để thao tác CRUD.

2. Chức năng quản lý nhân vật (Đối tượng 01: Character)
Thêm, sửa, xoá nhân vật (tên, level, HP, MP, class như "warrior", "mage")

Liệt kê danh sách nhân vật

Lọc theo class, level, giới tính...

3. Chức năng quản lý bản đồ (Đối tượng 02: Map)
Thêm, sửa, xoá bản đồ (tên map, loại map: rừng, hang động, thành phố)

Gán nhân vật cho bản đồ (nhân vật đang ở đâu)

4. Chức năng quản lý nhiệm vụ (Đối tượng 03: Quest)
Thêm, sửa, xoá nhiệm vụ (tiêu đề, mô tả, phần thưởng)

Gán nhiệm vụ cho nhân vật

5. Chức năng mở rộng (tuỳ chọn):
Tìm nhân vật có level cao nhất

Thống kê số nhân vật trên từng bản đồ

Xuất dữ liệu sang JSON hoặc file CSV

Lưu checkpoint (bản đồ + nhiệm vụ + trạng thái nhân vật)








