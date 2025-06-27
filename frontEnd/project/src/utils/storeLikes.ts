export const likeControl = (pid: number) => {

    const likesSt = localStorage.getItem('likes')
    if (likesSt) {
        // likes var
        const arr = JSON.parse(likesSt) as number[]
        const index = arr.findIndex(item => item === pid)
        if (index > -1) {
            // daha önceden var, çıkar
            arr.splice(index, 1)
        }else {
            // yok ve ekle
            arr.push(pid)
        }
         const st = JSON.stringify(arr)
        localStorage.setItem("likes", st)
    }else {
        // likes yok yeni oluştur
        const arr = [pid]
        const st = JSON.stringify(arr)
        localStorage.setItem("likes", st)
    }

}


export const isFncLike = (pid: number) => {
    const stLikes = localStorage.getItem('likes')
    if (stLikes) {
        const arr = JSON.parse(stLikes) as number[]
        const index = arr.findIndex(item => item === pid)
        return index > -1 ? true : false
    }
    return false
}

export const allLikes = () => {
    const stLikes = localStorage.getItem('likes')
    if (stLikes) {
        const arr = JSON.parse(stLikes) as number[]
        return arr
    }
    return []
}