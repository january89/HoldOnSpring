<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<form>
    <fieldset class="form-group">
        <label for="postName">제목</label>
        <input type="text" class="form-control" id="postName" placeholder="제목을 입력하세요.">
        <small class="text-muted">We'll never share your email with anyone else.</small>
    </fieldset>
    <fieldset class="form-group">
        <label for="postTextarea">내용</label>
        <textarea class="form-control" id="postTextarea" rows="15"></textarea>
    </fieldset>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>