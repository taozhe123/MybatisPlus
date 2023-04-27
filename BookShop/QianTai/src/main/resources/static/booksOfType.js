
let booksOfTypeVue = new Vue({
  el: "#booksOfType",
  data() {
    return {
      bookList: [],
      booktype: "",
      typeName: sessionStorage.getItem("typeName")
    }
  },
  methods: {
    initBooks(typeId) {
      axios.get('/book/listByType?typeId=' + typeId)
          .then((response) => {
            booksOfTypeVue.bookList = response.data
            if (response.data.length===0){
              document.getElementsByTagName("h3")[0].parentElement.style.display="none"
            }
            console.log(response)
          })

    }
  },
  created() {
    console.log("booksOfTypeVue 对象创建完成了")
    let typeId = sessionStorage.getItem("typeId")
    this.booktype = sessionStorage.getItem("typeName")
    this.initBooks(typeId)
    console.log( sessionStorage.getItem("typeId") )
    console.log( sessionStorage.getItem("typeName") )
  }

});