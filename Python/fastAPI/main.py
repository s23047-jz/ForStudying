from typing import List
from uuid import UUID, uuid4

from fastapi import FastAPI, HTTPException

from models import User, Role, Gender, UserUpdateRequest

app_fastAAPI = FastAPI()

db: List[User] = [
    User(
        id=uuid4(), first_name="Jesica", last_name="Porn", gender=Gender.female, roles=[Role.student]
    ),
    User(
        id=uuid4(), first_name="Prisscilla", last_name="Hub", gender=Gender.female, roles=[Role.user, Role.admin]
    )
]

@app_fastAAPI.get('/')
async def root():
    return {"Hello": "World"}

@app_fastAAPI.get('/api/v1/users')
async def fetch_user():
    return db

@app_fastAAPI.post('/api/v1/users')
async def register_user(user: User):
    db.append(user)
    return {"id": user.id}

@app_fastAAPI.delete('/api/v1/users')
async def delete_user(user_id: UUID):
    for user in db:
        if user.id == user_id:
            db.remove(user)
            return
    raise HTTPException(status_code=404, detail=f"user with id: {user.id} does not exists")

@app_fastAAPI.put('/api/v1/users/{user_id}')
async def update_user(user_update: UserUpdateRequest, user_id: UUID):
    for user in db:
        if user_update.first_name is not None:
            user.first_name = user_update.first_name
        if user_update.last_name is not None:
            user.last_name = user_update.last_name
        if user_update.middle_name is not None:
            user.middle_name = user_update.middle_name
        if user_update.roles is not None:
            user.roles = user_update.roles
        return
    raise HTTPException(status_code=404, detail= f'user with id" {user_id} does not exists')