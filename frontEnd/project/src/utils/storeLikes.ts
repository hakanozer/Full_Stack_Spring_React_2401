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