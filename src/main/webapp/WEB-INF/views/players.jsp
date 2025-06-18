<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hiển Thị Cấp Độ Người Chơi</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }
        .container {
            max-width: 800px;
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .player-card {
            border: 1px solid #dee2e6;
            border-radius: 5px;
            padding: 15px;
            margin-bottom: 10px;
            background-color: #fff;
        }
        .player-card:hover {
            box-shadow: 0 0 5px rgba(0,0,0,0.2);
        }
        .level-badge {
            font-size: 0.9em;
            padding: 5px 10px;
            border-radius: 15px;
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center mb-4">Hiển Thị Cấp Độ Người Chơi</h1>
        
        <div class="row mb-4">
            <div class="col-md-6 offset-md-3">
                <form action="players" method="post" class="d-flex">
                    <input type="number" name="levelThreshold" class="form-control me-2" 
                           placeholder="Nhập cấp độ tối thiểu" value="${levelThreshold}" required>
                    <button type="submit" class="btn btn-primary">Hiển Thị Người Chơi</button>
                </form>
            </div>
        </div>

        <c:if test="${not empty highLevelPlayers}">
            <h3 class="mb-3">Người Chơi Có Cấp Độ >= ${levelThreshold}</h3>
            <div class="row">
                <c:forEach items="${highLevelPlayers}" var="player">
                    <div class="col-md-6">
                        <div class="player-card">
                            <h4>${player.name}</h4>
                            <p class="mb-1">Mã số: ${player.id}</p>
                            <span class="level-badge">Cấp ${player.level}</span>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </c:if>

        <c:if test="${empty highLevelPlayers and not empty levelThreshold}">
            <div class="alert alert-info text-center">
                Không tìm thấy người chơi nào có cấp độ >= ${levelThreshold}
            </div>
        </c:if>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html> 