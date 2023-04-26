
let bookDetailVue = new Vue({
  el: "#bookDetail",
  data() {
    return {
      bookId:-1,
      book:{}
    }
  },
  methods: {
    initBook(){
       axios.postForm("/book/detail",{bookId:this.bookId})
           .then( response =>{
             bookDetailVue.book = response.data;
           } )
    }
  },
  created() {
    console.log("bookDetailVue 对象创建完成了")

    //获取图书的id
    let bookId = sessionStorage.getItem("bookIdOfSeeDetail");
    console.log(bookId)
    this.bookId = bookId;

    //获取图书详情
    this.initBook();
  }

});


