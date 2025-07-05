import { combineReducers, legacy_createStore } from "redux";
import { likesReducer } from "./likesReducer";

const combine = combineReducers({
    likesReducer
})

// datayı redux ortamında kullanıma uygun hale getirme
export type StateType = ReturnType<typeof combine>

// store oluşturma
export const reduxStore = legacy_createStore(combine)