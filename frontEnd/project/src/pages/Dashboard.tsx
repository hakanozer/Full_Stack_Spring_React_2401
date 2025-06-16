import React, { useEffect } from 'react'

function Dashboard() {

  // yaşam döngüsü fonksiyonudur
  // Otomatik bir sefer çalışır
  useEffect(() => {
    const token = localStorage.getItem('token')
    if (!token) {
      // Oturum yok, logine gönder
      // window.location.replace('/')
    }
  }, [])

  return (
    <div>Dashboard</div>
  )

}

export default Dashboard