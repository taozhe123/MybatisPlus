

  let topNVue = new Vue({
    el: "#topN",
    data() {
        return {
          N:9,
          topNBooks:[]
        }
    },
    methods: {
      initTopNBooks(){
         axios.postForm("/book/topN",{N:this.N})
             .then( response => {
                 topNVue.topNBooks = response.data;
                 console.log(topNVue.topNBooks)
             } )
      }
    },
    created() {
      console.log("topNVue 对象创建完成了")

      this.initTopNBooks();
    }

  });

