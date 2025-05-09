# Group9
I - Tiêu đề
Thiết kế và phát triển Game 2D Phiêu lưu: 


II - Đối tượng
- Nhân vật chính (Main Character / Player):
Vai trò: Là đối tượng điều khiển chính trong game, do người chơi điều khiển để di chuyển, nhảy, chiến đấu và tương tác với môi trường.
Thuộc tính: Vị trí, tốc độ di chuyển, máu (HP), trạng thái (đang đứng, tấn công...), hoạt ảnh (animation).
Hành vi: Di chuyển trái/phải, tấn công, nhận sát thương, tương tác với vật phẩm hoặc NPC.

- Kẻ thù (Enemy):
Vai trò: Gây thử thách cho người chơi, tạo nên tính đối kháng và tăng độ khó.
Thuộc tính: Vị trí, sát thương, máu, phạm vi phát hiện người chơi, hoạt ảnh.
Hành vi: Tuần tra, đuổi theo người chơi, tấn công khi đến gần, chết khi hết máu.

- Vật phẩm (Item):
Vai trò: Hỗ trợ người chơi trong quá trình chơi game, tăng tính hấp dẫn và khám phá.
Thuộc tính: Loại vật phẩm (hồi máu, tăng tốc độ, chìa khóa...), vị trí, hiệu ứng khi nhặt.
Hành vi: Nằm cố định trên bản đồ, biến mất khi được nhặt, kích hoạt hiệu ứng hỗ trợ cho người chơi.


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


