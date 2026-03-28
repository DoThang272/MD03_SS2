1: Lấy toàn bộ danh sách công việc, người dùng.
GET /tasks
GET /users

2:Tạo mới công việc, tạo mới người dùng.
POST /tasks
POST /users

3:Cập nhật trạng thái một công việc, cập nhật vai trò của người dùng.
PUT /tasks/{id}
PUT /users/{id}

4: Xóa một công việc, xóa một người dùng khỏi hệ thống.
DELETE /tasks/{id}
DELETE /users/{id}

5: Tìm các công việc có mức độ ưu tiên là "high".
GET /tasks?priority=high

6: Tìm các công việc có độ ưu tiên là "high" và được giao cho người dùng với id là 1.
GET /tasks?priority=high&userId=1

7: Liệt kê toàn bộ công việc của 1 người dùng.
GET /users/{id}/tasks

8:Gắn công việc cho người dùng.
PUT /tasks/{taskId}/assign/{userId}